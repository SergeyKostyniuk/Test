package ua.sergey.test.web;

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

@RunWith(MockitoJUnitRunner.class)
public class StackoverflowControllerTest {

    @Mock
    private StackoverflowService stackoverflowService;
    @InjectMocks
    StackoverflowController sut;


    @Test
    public void getListOfProviders() throws Exception {
        List<StackoverflowWebsite> listOfProviders = sut.getListOfProviders();
    }

}