
package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	
	private LoginPage loginpage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmPage BookingConfirmaPage;
	private CancelBookingPage cancelBookingPage;
	
	
	public LoginPage getLoginpage() {
		return (loginpage==null)? loginpage=new LoginPage(): loginpage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage(): searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage(): selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage=new BookHotelPage():bookHotelPage;
	}
	public BookingConfirmPage getBookingConfirmaPage() {
		return (BookingConfirmaPage==null)?BookingConfirmaPage =new BookingConfirmPage():BookingConfirmaPage;
	}
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage==null)?cancelBookingPage= new CancelBookingPage():cancelBookingPage;
	}
	

	
	
	
	
	
}
