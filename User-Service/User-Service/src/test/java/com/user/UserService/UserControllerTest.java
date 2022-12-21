package com.user.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.user.UserService.model.Address;
import com.user.UserService.model.User;
import com.user.UserService.repository.UserRepository;
import com.user.UserService.service.UserService;


@SpringBootTest
public class UserControllerTest {




	    @Autowired
	    private UserService userService;
	    @MockBean
	    private UserRepository userRepository;
	    @Test
	    public void getAllUser()
	    {
	        List<Address> address=new ArrayList<Address>();
	        address.add(new Address(8987,"anjaneyaswamystreet","neelima colony","darsi","andhrapradesh",89765));
	        when(userRepository.findAll()).thenReturn(Stream.of(new User(4,"varshi","Female","varshi@gmial.com",7364839873L,"doctor","varshi@123",address)).collect(Collectors.toList()));

	        assertEquals(1,userService.getAllUsers().size());
	    }

	    @Test

	    public void addNewDoctor()
	    {
	        List<Address> address=new ArrayList<Address>();
	        address.add(new Address(6789,"GaneshStreet","SvnColony","Guntur","AndhraPradesh",89765));
	        User user=new User(7,"Anisri","Female","ani@gmial.com",7364839897L,"doctor","Ani@123",address);
	        when(userRepository.save(user)).thenReturn(user);
	        assertEquals(user,userService.addNewDoctorUser(user));



	    }
	    @Test
	    public void addNewAdminUser()
	    {
	        List<Address> address=new ArrayList<Address>();
	        address.add(new Address(7865,"MallakStreet","ParakshColony","Bellandhur","Bangalore",56789));
	        User user=new User(8,"Surya","Male","surya@gmail.com",9364839897L,"doctor","surya@123",address);
	        when(userRepository.save(user)).thenReturn(user);
	        assertEquals(user,userService.addNewAdminUser(user));
	    }
	    @Test
	    public void addNewDeliveryAgentUser()
	    {
	        List<Address> address=new ArrayList<Address>();
	        address.add(new Address(2098,"BandarStreet","MallakColony","Marthali","Bangalore",56788));
	        User user=new User(9,"Sneha","Female","sandeep@gmail.com",9634839897L,"deliveryAgent","sneha@123",address);
	        when(userRepository.save(user)).thenReturn(user);
	        assertEquals(user,userService.addNewDelivaryUser(user));
	    }
	    @Test
	    public void throwUserNotFoundByIdException()
	    {
	        List<Address> address=new ArrayList<Address>();
	        address.add(new Address(2098,"BandarStreet","MallakColony","Marthali","Bangalore",56788));
	        User user=new User(1,"Sai","Male","sai@gmail.com",8634839897L,"Admin","Sai@123",address);



	        int id=1;
	        if(userRepository.existsById(id))
	        {
	            return;
	        }
	        else
	        {
	           assertThat(String.format("Id bot found",id));
	        }



	    }
	    private void assertThat(String format) {


		}




		@Test
	    public void updateUser()
	    {
	        List<Address> address=new ArrayList<Address>();
	        address.add(new Address(2098,"BandarStreet","MallakColony","Marthali","Bangalore",56788));
	        User user=new User(9,"Sandeep","Male","sandeep@gmail.com",9634839897L,"doctor","sandeep@123",address);
	        when(userRepository.save(user)).thenReturn(user);
	        assertEquals(user,userService.updateUser(user));
	    }
	    @Test
	    public void findByMobileNumberTest()
	    {




	        List<Address> address=new ArrayList<Address>();
            address.add(new Address(123,"mpp school","mpp","prakasam","ap",8756));
	        User user=new User(9,"Sandeep","Male","sandeep@gmail.com",9634839897L,"doctor","sandeep@123",address);
	        Long number=7655678291L;



	        when(userRepository.findAllByMobileNumber(number))
	        .thenReturn(user);
	        assertEquals(user,userService.findAllByMobileNo(number));
	    }
	    @Test
	    public void findByUserNameTest()
	    {

	    	List<Address> address=new ArrayList<Address>();
	    	address.add(new Address(123,"mpp school","mpp","prakasam","ap",8756));
	        User user = new User(1,"Srimanya Gangavarapu","female","srimanya@gmail.com", 7655678291L,"customer","Manya@123",address);
	        String userName=(String) toString();
	        userName="Srimanya Gangavarapu";



	        when(userRepository.findByFullName(userName))
	        .thenReturn(user);
	        assertEquals(user,userService.getByUserName(userName));
	    }
	    @Test
	    public void deleteByUserId()
	    {
	        List<Address> address=new ArrayList<Address>();
	        address.add(new Address(2098,"BandarStreet","MallakColony","Marthali","Bangalore",56788));
	        User user=new User(9,"harshi","Female","sandeep@gmail.com",9634839897L,"admin","harshi@123",address);
	        int id=10;
	       userRepository.deleteById(id);
	    }
	}

