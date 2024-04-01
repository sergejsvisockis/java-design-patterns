package com.iluwatar.activerecord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QueryTest {

  @Test
  void shouldConstructFullInsertQuery() {
    Courier courier = new Courier();
    courier.setId(1L);
    courier.setFirstName("John");
    courier.setLastName("Smith");

    final String expected = "INSERT INTO Courier (id,firstName,lastName) VALUES (?,?,?)";

    String insertQuery = courier.constructInsertionQuery();

    assertEquals(expected, insertQuery);
  }
}
