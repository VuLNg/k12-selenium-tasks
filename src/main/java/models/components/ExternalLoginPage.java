package models.components;

public  class ExternalLoginPage extends LoginPage {

    @Override
    public void inputUserName(String userNameString) {
        System.out.println(userNameString);
    }
}
