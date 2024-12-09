package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.model.BeerStyle;
import guru.springframework.spring6restmvc.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by jt, Spring Framework Guru.
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final Map<Long, Customer> customerMap;

    public CustomerServiceImpl() {
        this.customerMap = new HashMap<>();

        Customer c1 = Customer.builder()
                .id(1)
                .version(1)
                .customerName("Galaxy Cat")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer c2 = Customer.builder()
                .id(2)
                .version(1)
                .customerName("Crank")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer c3 = Customer.builder()
                .id(3)
                .version(1)
                .customerName("Sunshine City")
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        customerMap.put(c1.getId(), c1);
        customerMap.put(c2.getId(), c2);
        customerMap.put(c3.getId(), c3);
    }

    @Override
    public List<Customer> listCustomers(){
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getCustomerById(Long id) {

        log.debug("Get Customer by Id - in service. Id: " + id);

        return customerMap.get(id);
    }
}
