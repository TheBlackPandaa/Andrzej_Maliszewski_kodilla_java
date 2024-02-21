package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Test
    void saveInvoiceDaoTest(){
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        productDao.save(product1);
        productDao.save(product2);

        Item item1 = new Item(new BigDecimal(100),4,new BigDecimal(400));
        Item item2 = new Item(new BigDecimal(50),10,new BigDecimal(500));
        Item item3 = new Item(new BigDecimal(50),2,new BigDecimal(100));

        Invoice invoice = new Invoice("12345");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        //Then
        assertNotEquals(0,invoiceId);
        //Cleanup
        invoiceDao.deleteById(invoiceId);
    }
}
