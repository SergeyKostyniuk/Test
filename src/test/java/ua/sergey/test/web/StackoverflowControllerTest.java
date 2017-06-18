package ua.sergey.test.web;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ua.sergey.test.model.StackoverflowWebsite;
import ua.sergey.test.service.StackoverflowService;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StackoverflowControllerTest {

    @Mock
    private StackoverflowService stackoverflowService;
    @InjectMocks
    StackoverflowController sut;


    @Test
    public void getListOfProviders() throws Exception {
        //prepere
        when(stackoverflowService.findAll()).thenReturn(ImmutableList.of());
        //testing
        List<StackoverflowWebsite> listOfProviders = sut.getListOfProviders();
        //validate
        verify(stackoverflowService).findAll();
    }

}