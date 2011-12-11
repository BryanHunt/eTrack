
package org.eclipselabs.etrack.web.storage.bundle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.etrack.domain.entity.EntityFactory;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.entity.Phone;
import org.eclipselabs.mongo.emf.MongoDBURIHandlerImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator
{

	@Override
	public void start(BundleContext context) throws Exception
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
		uriHandlers.add(0, new MongoDBURIHandlerImpl());

		Person person = EntityFactory.eINSTANCE.createPerson();
		person.setFirstName("Foo");
		person.setLastName("Bar");
		Phone phone = EntityFactory.eINSTANCE.createPhone();
		phone.setNumber("867-5309");
		person.getPhoneNumbers().add(phone);

		Resource resource = resourceSet.createResource(URI.createURI("mongo://localhost/etrack/entity/foo"));
		resource.getContents().add(person);
		resource.save(null);
	}

	@Override
	public void stop(BundleContext context) throws Exception
	{
		// TODO Auto-generated method stub

	}

}
