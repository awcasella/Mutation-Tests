package com.wmoc.mutation;

/**
 * Hello world!
 *
 */
public class PersonGenerator {
    private PersonGenerator() {}

    public static Person of(final String name, final Integer age) {
        if(name == null || age == null){
            return null;
        }

        Person person = new Person();

        person.setName(name);
        person.setAge(age);

        return person;
    }
}
