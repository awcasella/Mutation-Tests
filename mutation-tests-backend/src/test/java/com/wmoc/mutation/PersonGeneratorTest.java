package com.wmoc.mutation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;

/**
 * Unit tests for killing mutants.
 */
public class PersonGeneratorTest {

    @Test
    @DisplayName("Retorna null - Quando idade for null")
    void retornaNullParaIdadeNull() {
        final Integer age = null;
        final String name = "John Doe";

        Person pessoa = PersonGenerator.of(name, age);

        assertNull(pessoa);
    }

    @Test
    @DisplayName("Retorna null - Quando nome for null")
    void retornaNullParaNomeNull() {
        final Integer age = 40;
        final String name = null;

        Person pessoa = PersonGenerator.of(name, age);

        assertNull(pessoa);
    }
    
    @Test
    @DisplayName("Deverá retornar pessao criada - Quando sucesso")
    void of_Usuario_QuandoSucesso() {
        final Integer age = 40;
        final String name = "John Doe";

        Person pessoa = PersonGenerator.of(name, age);

        assertNotNull(pessoa);
        assertEquals(name, pessoa.getName());
        assertEquals(age, pessoa.getAge());
    }
}
