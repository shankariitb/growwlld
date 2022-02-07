package com.groww.lld;

import com.groww.lld.domain.Group;
import com.groww.lld.domain.User;
import com.groww.lld.service.ServiceInterface;
import com.groww.lld.service.ServiceInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class LldApplication {


	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(LldApplication.class, args);
		User user1 = new User(1,"user1");
		User user2 = new User(2,"user2");
		List<User>group1Users =new ArrayList<>();
//		ServiceInterface serviceInterface = new ServiceInterfaceImpl();
		ServiceInterface serviceInterface = applicationContext.getBean(ServiceInterface.class);
		group1Users.add(user1);
		group1Users.add(user2);
		serviceInterface.saveUser(user1);
		serviceInterface.saveUser(user2);
		Group group1 = new Group(1,group1Users);
//		serviceInterface.addMember(groudId,User);
		serviceInterface.saveGroup(group1);
		serviceInterface.splitBill(group1.getId(),user1,100);
		serviceInterface.splitBill(group1.getId(),user2,90);
		serviceInterface.showBalance(group1.getId());
	}

}
