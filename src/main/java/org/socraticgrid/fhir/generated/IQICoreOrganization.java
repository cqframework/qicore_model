package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreOrganization
{

   public Organization getAdaptee();

   public void setAdaptee(Organization param);

   public QICoreOrganizationAdapter getPartOfResource();

   public IQICoreOrganization setPartOfResource(QICoreOrganizationAdapter param);

   public List<AddressDt> getAddress();

   public IQICoreOrganization setAddress(List<AddressDt> param);

   public IQICoreOrganization addAddress(AddressDt param);

   public AddressDt addAddress();

   public AddressDt getAddressFirstRep();

   public StringDt getNameElement();

   public String getName();

   public IQICoreOrganization setName(String param);

   public IQICoreOrganization setName(StringDt param);

   public List<Organization.Contact> getContact();

   public IQICoreOrganization setContact(List<Organization.Contact> param);

   public IQICoreOrganization addContact(Organization.Contact param);

   public Organization.Contact addContact();

   public Organization.Contact getContactFirstRep();

   public BooleanDt getActiveElement();

   public Boolean getActive();

   public IQICoreOrganization setActive(Boolean param);

   public IQICoreOrganization setActive(BooleanDt param);

   public NarrativeDt getText();

   public IQICoreOrganization setText(NarrativeDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreOrganization setIdentifier(List<IdentifierDt> param);

   public IQICoreOrganization addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public CodeableConceptDt getType();

   public IQICoreOrganization setType(CodeableConceptDt param);

   public CodeDt getLanguage();

   public IQICoreOrganization setLanguage(CodeDt param);

   public List<ContactPointDt> getTelecom();

   public IQICoreOrganization setTelecom(List<ContactPointDt> param);

   public IQICoreOrganization addTelecom(ContactPointDt param);

   public ContactPointDt addTelecom();

   public ContactPointDt getTelecomFirstRep();

   public ContainedDt getContained();

   public IQICoreOrganization setContained(ContainedDt param);

   public IdDt getId();

   public IQICoreOrganization setId(IdDt param);
}