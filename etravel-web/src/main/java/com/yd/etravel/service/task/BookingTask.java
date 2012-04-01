/**
 * 
 */
package com.yd.etravel.service.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.yd.etravel.service.booking.IBookingManager;

/**
 * com.yd.etravel.service.task.BookingTask
 * 
 * @author shanaka
 * 
 */
public class BookingTask implements ITask {

    private IBookingManager bookingManager;
    protected static final Log log = LogFactory.getLog(BookingTask.class);

    public IBookingManager getBookingManager() {
	return bookingManager;
    }

    public void setBookingManager(IBookingManager bookingManager) {
	this.bookingManager = bookingManager;
    }

    /**
	 * 
	 */
    public BookingTask() {
	// TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.service.task.ITask#runTask()
     */
    public void runTask() {
	try {
	    Thread.currentThread().setName(THREADNAME);
	    getBookingManager().saveFailedOnRequestBookings();
	    getBookingManager().saveFailedOnlineBookings();
	} catch (Exception e) {
	    log.fatal(e.getMessage(), e);
	}

    }

}