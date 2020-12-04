package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ProductOrderService {
    public void manageOrder() {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        Processor processor = new Processor(new EmailSender(),
                new EvolutionStoneSales(), new SaleRecordDatabase());
        processor.process(order);
    }
}
