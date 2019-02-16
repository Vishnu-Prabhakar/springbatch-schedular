package com.example.springbatch.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.example.springbatch.student.StudentDTO;

/**
 * This custom {@code ItemProcessor} simply writes the information of the
 * processed student to the log and returns the processed object.
 *
 * @author Petri Kainulainen
 */
public class LoggingStudentProcessor implements ItemProcessor<StudentDTO, StudentDTO> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingStudentProcessor.class);

    @Override
    public StudentDTO process(StudentDTO item) throws Exception {
        LOGGER.info("Processing student information: {}", item);
        return item;
    }
}
