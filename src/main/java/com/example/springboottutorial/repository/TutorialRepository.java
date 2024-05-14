package com.example.springboottutorial.repository;
//import com.bezkoder.spring.jpa.query.model.Tutorial;
import com.example.springboottutorial.model.Tutorial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findAll();

//    Object save(Tutorial t);
    Page<Tutorial> findAll(Pageable pageable);

    List<Tutorial> findBydescriptionContains(String descName);

//    List<Tutorial> findBydescriptionLike(String descName);

//    @Query("select t from tutorials t where t.description = ?1")
//@Query("select t from tutorials t")
@Query(value = "select * From tutorials where description = ?1", nativeQuery=true)
    List<Tutorial> findBydescriptionLike(@Param("description") String description);

//    @Override
//    <S extends Tutorial> S save(S entity);


    //These get by Ends with fields name --- These are derived Queries Provided by JPA inbuilt way
//    Tutorial getById(Long id);
//    Tutorial getByTitle(String tittle);

    //Custom Queries are the one which we want to define with our field name - JPQL Queries
//    @Query("from Tutorial t where t.id=?1")
//    Tutorial getByIdentifier(Long Id);

    //Native SQL means --- SQL Queries are framed
//    @Query(value = "select * from tutorial t where t.id=?1",nativeQuery = true)
//    Tutorial getByIdentfr(Long Id);

    //Named Query
//    In ENtity Class define @NamedQuery(name="showbyCategoryjpql",query="from ****") -- JPQL Query
//    In ENtity Class define @NamedNativeQuery(name="showbyCategorySql",query="select * from ****") -- SQL Query
//    In ENtity Class define
//    @NamedQueries(
//    values={
//            @NamedQuery(name="showbyCategoryjpql1",query="from ****"),
//            @NamedQuery(name="showbyCategoryjpql2",query="from ****")
//    })
//
//    @Query(name="showbyCategoryjpql")
//    Tutorial getByIdentfr(Long Id);
//
//    @Query(name="showbyCategorySql",nativeQuery=true)
//    Tutorial getByIdentfer(Long Id);
}
