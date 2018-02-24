package br.com.academia.dao;
/*
@Author: Deepak Kumar
Check more tutorials at http://www.roseindia.net
*/
import br.com.academia.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}