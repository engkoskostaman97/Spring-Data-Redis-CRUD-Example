Step By Step nosql dataredis crud simple

- set and run terlebih dahulu redis

  ![image](https://github.com/engkoskostaman97/Spring-Data-Redis-CRUD-Example/assets/110719940/3a6c338b-44ab-4e10-b78a-591923ac0694)


- buat project java spring

  ![image](https://github.com/engkoskostaman97/Spring-Data-Redis-CRUD-Example/assets/110719940/44ae89fe-a612-4373-b968-ee012334f6d3)

  tambahkan file model

      package belajar.crud.redis.redis.java.spring.model;
    
    import org.springframework.data.annotation.Id;
    import org.springframework.data.redis.core.RedisHash;
    import org.springframework.data.redis.core.index.Indexed;
    import lombok.Data;
    
    @Data
    @RedisHash(value = "student")
    public class Student {
    
        @Id
        @Indexed
        private String id;
        private String name;
        private String grade;
    }
  
