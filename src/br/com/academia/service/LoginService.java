package br.com.academia.service;
/*
@Author: Deepak Kumar
Check more tutorials at http://www.roseindia.net
*/
import br.com.academia.model.*;

public interface LoginService{    
       public boolean checkLogin(String userName, String userPassword);
}