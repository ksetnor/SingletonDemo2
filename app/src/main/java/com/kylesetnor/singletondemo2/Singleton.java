package com.kylesetnor.singletondemo2;


public class Singleton {


    private static Singleton singletonObject = null;


    private Singleton()
    {
        //private constructor allows only createSingleton() to create instances
    }


    public static Singleton createSingleton()
    {
        if (singletonObject == null)
        {
            singletonObject = new Singleton();
        }

        return singletonObject;
    }

    //used to pass the object so MainActivity can look up its hashID
    public static Singleton getSingletonInstance()
    {

        return singletonObject;
    }

}
