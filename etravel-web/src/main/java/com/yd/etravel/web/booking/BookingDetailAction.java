/**
 * 
 */
package com.yd.etravel.web.booking;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yd.etravel.domain.custom.booking.BookingReportSearchDTO;
import com.yd.etravel.web.common.BaseAction;

/**
 * 
 * @author : Yohan Ranasinghe. Created Date : May 20, 2009 : 9:06:40 AM Type :
 *         com.yd.etravel.web.booking.BookingDetailAction
 * 
 */

public class BookingDetailAction extends BaseAction {

    /**
	 * 
	 */
    public BookingDetailAction() {
	// TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.web.common.BaseAction#add(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward add(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.web.common.BaseAction#back(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward back(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yd.etravel.web.common.BaseAction#create(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    public ActionForward create(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yd.etravel.web.common.BaseAction#delete(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward delete(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.web.common.BaseAction#edit(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward edit(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.web.common.BaseAction#find(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward find(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	final BookingDetailForm detailForm = (BookingDetailForm) form;
	detailForm.setItemBookingList(getItemManager().findByBookingId(
		detailForm.getBookingId()));
	final BookingReportSearchDTO dto = new BookingReportSearchDTO();
	dto.setId(detailForm.getBookingId());
	detailForm.setBookingReportDTO(getBookingManager().findBookingDetail(
		dto).get(0));
	return mapping.findForward(SUCCESS);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yd.etravel.web.common.BaseAction#forward(org.apache.struts.action
     * .ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward forward(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.web.common.BaseAction#init(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward init(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	return mapping.findForward(SUCCESS);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yd.etravel.web.common.BaseAction#process(org.apache.struts.action
     * .ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    public ActionForward process(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.web.common.BaseAction#save(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward save(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.web.common.BaseAction#send(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward send(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yd.etravel.web.common.BaseAction#sort(org.apache.struts.action.
     * ActionMapping, org.apache.struts.action.ActionForm,
     * javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ActionForward sort(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ActionForward search(final ActionMapping mapping,
	    final ActionForm form, final HttpServletRequest request,
	    final HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

}
