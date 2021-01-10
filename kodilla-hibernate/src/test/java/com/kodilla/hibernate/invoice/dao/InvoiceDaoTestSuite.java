package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("15648");

        Product product = new Product("product 1");
        Product product2 = new Product("product 2");

        Item item = new Item(new BigDecimal(10), 5);
        Item item2 = new Item(new BigDecimal(20), 5);

        item.setProduct(product);
        item2.setProduct(product2);

        product.getItems().add(item);
        product2.getItems().add(item2);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        Invoice loadedFromDB = invoiceDao.findById(id).get();


        //Then
        assertNotEquals(0, id);
        assertEquals(2, invoice.getItems().size());
        assertEquals(2, loadedFromDB.getItems().size());
        assertEquals("product 1", loadedFromDB.getItems().get(0).getProduct().getName());
        assertEquals("product 2", loadedFromDB.getItems().get(1).getProduct().getName());
        assertEquals(invoice.getNumber(), item.getInvoice().getNumber(), product.getItems().get(0).getInvoice().getNumber());
        assertEquals(product.getName(), invoice.getItems().get(0).getProduct().getName());


        //Cleanup
        invoiceDao.delete(invoice);

        //Printscreens in 'resources'
    }
}
