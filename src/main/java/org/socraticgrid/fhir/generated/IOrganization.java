package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
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
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IOrganization
{

   public Organization getAdaptee();

   public void setAdaptee(Organization param);

   public List<Organization.Contact> getContact();

   public IOrganization setContact(List<Organization.Contact> param);

   public IOrganization addContact(Organization.Contact param);

   public Organization.Contact addContact();

   public Organization.Contact getContactFirstRep();

   public NarrativeDt getText();

   public IOrganization setText(NarrativeDt param);

   public List<IdentifierDt> getIdentifier();

   public IOrganization setIdentifier(List<IdentifierDt> param);

   public IOrganization addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public Organization getPartOfResource();

   public IOrganization setPartOfResource(Organization param);

   public CodeableConceptDt getType();

   public IOrganization setType(CodeableConceptDt param);

   public CodeDt getLanguage();

   public IOrganization setLanguage(CodeDt param);

   public List<ContactPointDt> getTelecom();

   public IOrganization setTelecom(List<ContactPointDt> param);

   public IOrganization addTelecom(ContactPointDt param);

   public ContactPointDt addTelecom();

   public ContactPointDt getTelecomFirstRep();

   public StringDt getNameElement();

   public String getName();

   public IOrganization setName(String param);

   public IOrganization setName(StringDt param);

   public ContainedDt getContained();

   public IOrganization setContained(ContainedDt param);

   public BooleanDt getActiveElement();

   public Boolean getActive();

   public IOrganization setActive(Boolean param);

   public IOrganization setActive(BooleanDt param);

   public List<AddressDt> getAddress();

   public IOrganization setAddress(List<AddressDt> param);

   public IOrganization addAddress(AddressDt param);

   public AddressDt addAddress();

   public AddressDt getAddressFirstRep();

   public IdDt getId();

   public IOrganization setId(IdDt param);
}