package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
       AccountRepository accountRepo=  context.getBean(AccountRepository.class);	
       
       
     
    /*Insertion of data
       AccountPK accountPk = new AccountPK();
       accountPk.setAccId(2);
       accountPk.setAccType("Current");
       accountPk.setAccNum((long) 43345678);
       
       Account account = new Account();
       account.setHolderName("Ranjan");
       account.setBranch("AmeerPeth");
       account.setAccountPk(accountPk);
       
       accountRepo.save(account); 
       */
      
       //retrival of data
       AccountPK accountPk = new AccountPK();
       accountPk.setAccId(2);
       accountPk.setAccType("Current");
       accountPk.setAccNum((long) 43345678);
       
       Optional<Account> findById = accountRepo.findById(accountPk);
       System.out.println(findById.get());
       
       
	}

}