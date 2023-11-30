package models.components;

public  class InternalLoginPage extends LoginPage {

    @Override
    public void inputUserName(String userNameString) {
        System.out.println(userNameString);
    }
}
