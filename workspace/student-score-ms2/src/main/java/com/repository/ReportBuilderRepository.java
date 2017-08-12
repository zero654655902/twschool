package com.repository;

import com.core.Report.ReportBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lwan on 12/08/2017.
 */
@Repository
public interface ReportBuilderRepository extends JpaRepository<ReportBuilder,String>{
    ReportBuilder save(ReportBuilder reportBuilder);
    ReportBuilder findById(String id);
    List<ReportBuilder> findAll();
    ReportBuilder deleteById(String id);
}
