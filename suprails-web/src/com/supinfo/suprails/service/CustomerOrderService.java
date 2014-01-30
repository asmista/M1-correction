package com.supinfo.suprails.service;

import com.supinfo.suprails.dao.CustomerOrderDao;
import com.supinfo.suprails.entity.Customer;
import com.supinfo.suprails.entity.CustomerOrder;

import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class CustomerOrderService {

    @EJB
    private CustomerOrderDao customerOrderDao;
    @EJB
    private PrinterService printerService;

    public void processCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
        sendEmail(customerOrder.getCustomer());
        printerService.print(customerOrder);
    }

    @Asynchronous
    public void sendEmail(Customer customer) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Send mail to " + customer.getFirstName()
                + " " + customer.getLastName() + " at " + customer.getEmail());
    }
}
