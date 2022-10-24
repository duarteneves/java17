package pt.dneves.var;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Var {

//	var var = 0;

	public void inference(int arg) {
		var v1 = "Hello";
		var v2 = arg;
	}
	
	public void notKeyword() {
		var var = 0;
	}
	
	public void readableWithVar() {
		
		var userService = new UserService();
		var userAccounts = userService.getUserAccounts();
		var myAccounts = userAccounts.get(123456789);
		
	}
	
	public void readableWithoutVar() {
		
		UserService userService = new UserService();
		Map<Integer, List<Account>> userAccounts = userService.getUserAccounts();
		List<Account> myAccounts = userAccounts.get(123456789);
		
	}
	
	public void unreadableWithVar() {
		
		UserService userService = new UserService();
		var x = userService.getSomething();
		
	}

	public void mustBeAssinged() {
//		var var2;
//		var2 = 0;
	}

	public void noAssignedWithNull() {
//		var var = null;
	}

//	public var noVarAtMethodReturnType() {
//		return 0;
//	}

	
	public void forLoop() {
		
		List<User> users = new ArrayList<>();
		
		for (var user: users) {
		}
		
		for (var i = 0; i < users.size(); i++) {
			// do nothing
		}
		
	}
	
	public void noMultipleVarDecl() {
		int x = 1, y = 2;
//		var w = 1, z = 2;
	}
	
	public void notBeReassigned(int arg) {
		var v1 = "Hello";
//		v1 = arg;
	}
	
}
