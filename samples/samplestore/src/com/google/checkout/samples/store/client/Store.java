// Copyright 2007 Google Inc. All Rights Reserved.

package com.google.checkout.samples.store.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.HistoryListener;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Main class for Storefront which displays the screen objects and layout.
 * 
 * @author Simon Lam (simonlam@google.com)
 */
public class Store implements EntryPoint, BaseFeedListener, 
    HistoryListener {

  public static final int NUM_ROWS = 4;
  public static final int NUM_COLS = 4;
  
  private JSON feed = new JSON();
  private HorizontalPanel horzPanel = new HorizontalPanel();
  private VerticalPanel categoryPanel = new VerticalPanel();
  private HashMap categories = new HashMap();
  private HashMap products;
  private Grid grid = new Grid(NUM_ROWS, NUM_COLS);
  
  public void onModuleLoad() {
    feed.registerListener(this);
    feed.fetchProductsFromBase("2828467"); // our test account
    //feed.fetchProductsFromBase("1161353"); // buy.com
    History.addHistoryListener(this);
    initializeMainForm();
  }
  
  /**
   * Initialize the main form's layout and content.
   */
  public void initializeMainForm() {
    RootPanel.get().add(horzPanel);
    horzPanel.add(categoryPanel);
    horzPanel.add(grid);
  }

  public void updateList(HashMap items) {
    boolean init = false;
    products = items;
    Iterator iter = items.entrySet().iterator();
    while(iter.hasNext()) {
      Map.Entry entry = (Map.Entry) iter.next();
      String category = ((Category) entry.getKey()).getName();
      if (!categories.containsKey(category)) {
        categories.put(((Category) entry.getKey()).getName(), null);
        Hyperlink link = new Hyperlink(category, category);
        categoryPanel.add(link);
      }
      if (!init) {
        onHistoryChanged(category);
        init = true;
      }
    }
  }

  public void onHistoryChanged(String historyToken) {
    grid.clear();
    ProductList filteredList = (ProductList) products.get(Category.getCategory(historyToken));
    for (int i = 0; i < filteredList.size(); i++) {
      ProductBox productBox = new ProductBox((Product) filteredList.get(i));
      grid.setWidget(i / NUM_ROWS, i % NUM_COLS, productBox);
      if ((i + 1) == NUM_ROWS*NUM_COLS)
        break;
    }
  }

}
