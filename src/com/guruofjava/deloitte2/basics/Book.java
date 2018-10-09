package com.guruofjava.deloitte2.basics;

public class Book {

	int no_of_pages,
		current_page;
	String title,
		   author,
		   publisher;
	boolean isOpen,
			isClose;
	
	public Book()
	{
		no_of_pages = 100;
		current_page = 0;
		title = "Shadow";
		author = "Rudra";
		publisher = "Mukherjee Publication House";
		isOpen = false;
		isClose = true;
		
	}
	public Book(int n,int cp,String t,String a,String p)
	{
		no_of_pages = n;
		current_page = cp;
		title = t;
		author = a;
		publisher = p;
		isOpen = false;
		isClose = true;
	}
	public void open()
	{
		isOpen = true;
		isClose = false;
	}
	public void open(int page_num)
	{
		current_page = page_num;
	}
	public void close()
	{
		isOpen = false;
		isClose = true;
	}
	public boolean isOpen()
	{
		return isOpen;
	}
	public boolean isClose()
	{
		return isClose;
	}
	public int turnLeft()
	{
		current_page+=2;
		if(current_page > no_of_pages)
			return -1;
		else
			return current_page;
	}
	public int turnRight()
	{
		current_page-=2;
		if(current_page < 0)
			return -1;
		else
			return current_page;
	}

}


