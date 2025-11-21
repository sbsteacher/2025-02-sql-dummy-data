package kr.domsam.youbankdummy.application;

import kr.domsam.youbankdummy.Dummy;
import kr.domsam.youbankdummy.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BankAccountDummy extends Dummy {

    @Autowired CustomerRepository customerRepository;
    @Autowired BankAccountRepository bankAccountRepository;

    @Test
    void ins() {
        List<Customer> customerList = customerRepository.findAll();
        for(Customer c : customerList) {
            System.out.println(c);
        }

    }
}
