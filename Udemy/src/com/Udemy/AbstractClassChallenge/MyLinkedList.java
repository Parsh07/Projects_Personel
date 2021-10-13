package com.Udemy.AbstractClassChallenge;

public class MyLinkedList implements NodeList{
	private ListItem root = null;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if(this.root == null) {
			this.root = newItem;
			return true;
		}
		
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = (currentItem.compateTo(newItem));
			if(comparison <0) {
				if(currentItem.next() !=null) {
					currentItem = currentItem.next();
				}else {
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					return true;
				}
			}
		}
		
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void tranverse(ListItem root) {
		// TODO Auto-generated method stub
		
	}
	
	
}
