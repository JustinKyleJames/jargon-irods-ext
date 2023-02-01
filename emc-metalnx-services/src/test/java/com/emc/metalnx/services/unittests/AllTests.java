package com.emc.metalnx.services.unittests;

import com.emc.metalnx.services.irods.CollectionServiceImplTest;
import com.emc.metalnx.services.tests.metadata.TestAddMetadataToObjs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CollectionServiceImplTest.class, TestAddMetadataToObjs.class })
public class AllTests {

}
