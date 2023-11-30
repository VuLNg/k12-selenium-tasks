package models.components;

import java.lang.reflect.Constructor;

public class ComponentExploring {
    // Boundary generic type
    public <T extends LoginPage> void login(Class<T> loginPageClass, String userNameString) {
        // Wildcard generic type
        Class<?>[] parameter = new Class[]{};

        try {
            // Java Reflection
            Constructor<T> constructor = loginPageClass.getConstructor(parameter);
            T loginPageObj  = constructor.newInstance();

            loginPageObj.inputUserName(userNameString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
