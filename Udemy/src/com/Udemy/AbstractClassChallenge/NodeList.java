package com.Udemy.AbstractClassChallenge;

public interface NodeList {
	ListItem getRoot();
	boolean addItem(ListItem item);
	boolean removeItem(ListItem item);
	void tranverse(ListItem root);
}
