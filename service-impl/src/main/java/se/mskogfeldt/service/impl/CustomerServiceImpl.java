package se.mskogfeldt.service.impl;

import se.mskogfeldt.domain.Customer;
import se.mskogfeldt.entity.CustomerEntity;
import se.mskogfeldt.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    public void createCustomer(Customer customer){
        CustomerEntity customerEntity = CustomerEntity.builder()
                .withSsn(customer.getSsn())
                .withFirstName(customer.getFirstName())
                .withLastName(customer.getLastName()).build();

    }

    /*

     @Override
    public void createAccount(Account account) {
        AccountEntity accountEntity = AccountEntity.builder().withSsn(account.getSsn()).withAmount(account.getAmount()).withAccountName(account.getAccountName()).build();
        accountDao.insert(accountEntity);


        account.getOrders().stream().map(order -> OrderEntity.builder().withSsn(account.getSsn()).withAmount(order.getAmount()).build())
                .forEach(orderDao::insert);
    }
     */

    /*

    public void create(Account account) {
        if(accounts.containsKey(account.getId())){
            throw new RuntimeException("Account already exists");
        }
        accounts.put(account.getId(),account);
    }

     */
}
