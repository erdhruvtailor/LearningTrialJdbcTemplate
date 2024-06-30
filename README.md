# jdbctemplate
Trail demo of JDBC Template

1. Covering StringBuilder and StringBuffer
2. RowMapper and BeanPropertyRowMapper(Importantly, while using BeanPropertyRowMapper, all attributes should be same in schema and model)
3. data.sql and schema.sql automatically create table for memory base datasource url jdbc:h2:mem:appdb 

    StringBuilder, StringBuffer, RowMapper and BeanPropertyRowMapper are complex stuff so Hibernate made entry in picture.

4. in Model(POJO),

@Data: getter, setter, equal, hashcode, toString, require argument constructor
@Builder: to create object, which can specify and configure value

5. ORM(Object Relational Mapping)  Hibernate/Mybaties
    Java = Object
    DB Table  = Relational

    Any data coming from the database, would be automatically map into java object, hibernate will give you objects right there

    
    Hibernate + Mybaties = Full abstract functionality known as JPA Java/Jakarta persistence API

    JPA -> made the rules, Hibernate and Mybaties have to implement rules