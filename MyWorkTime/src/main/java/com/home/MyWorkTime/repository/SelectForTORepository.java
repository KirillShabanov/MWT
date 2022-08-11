package com.home.MyWorkTime.repository;

import com.home.MyWorkTime.entity.SelectForTOModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;


public interface SelectForTORepository extends JpaRepository<SelectForTOModel, Long> {

    @Query(value = "SELECT number_TO, automobile, modification, partNumber, amount, jobCode, jobTime FROM to_regulations " +
            "LEFT JOIN regulations ON to_regulations.FK_numTO = regulations.id " +
            "LEFT JOIN auto ON to_regulations.FK_autoTO = auto.id " +
            "LEFT JOIN part ON to_regulations.FK_partNumberTO = part.id " +
            "LEFT JOIN normalization ON to_regulations.FK_jobCodeTO = normalization.id " +
            "WHERE FK_numTO = (keyTO) AND FK_autoTO = (keyAuto)", nativeQuery = true)
    public List<Map<Long,Long>> findTOFromKey();
}
