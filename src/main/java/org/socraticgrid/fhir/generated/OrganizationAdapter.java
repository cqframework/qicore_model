package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IOrganization;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class OrganizationAdapter implements IOrganization
{

   private Organization adaptedClass = null;

   public OrganizationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Organization();
   }

   public OrganizationAdapter(Organization adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Organization getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Organization param)
   {
      this.adaptedClass = param;
   }

   public List<Organization.Contact> getContact()
   {
      return adaptedClass.getContact();
   }

   public IOrganization setContact(List<Organization.Contact> param)
   {
      adaptedClass.setContact(param);
      return this;
   }

   public IOrganization addContact(Organization.Contact param)
   {
      adaptedClass.addContact(param);
      return this;
   }

   public Organization.Contact addContact()
   {
      ca.uhn.fhir.model.dstu2.resource.Organization.Contact item = new ca.uhn.fhir.model.dstu2.resource.Organization.Contact();
      adaptedClass.addContact(item);
      return item;
   }

   public Organization.Contact getContactFirstRep()
   {
      return adaptedClass.getContactFirstRep();
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IOrganization setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IOrganization setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IOrganization addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public Organization getPartOfResource()
   {
      if (adaptedClass.getPartOf().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
               .getPartOf().getResource();
      }
      else
      {
         return null;
      }
   }

   public IOrganization setPartOfResource(Organization param)
   {
      adaptedClass.getPartOf().setResource(param);
      return this;
   }

   public CodeableConceptDt getType()
   {
      return adaptedClass.getType();
   }

   public IOrganization setType(CodeableConceptDt param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IOrganization setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<ContactPointDt> getTelecom()
   {
      return adaptedClass.getTelecom();
   }

   public IOrganization setTelecom(List<ContactPointDt> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public IOrganization addTelecom(ContactPointDt param)
   {
      adaptedClass.addTelecom(param);
      return this;
   }

   public ContactPointDt addTelecom()
   {
      ca.uhn.fhir.model.dstu2.composite.ContactPointDt item = new ca.uhn.fhir.model.dstu2.composite.ContactPointDt();
      adaptedClass.addTelecom(item);
      return item;
   }

   public ContactPointDt getTelecomFirstRep()
   {
      return adaptedClass.getTelecomFirstRep();
   }

   public StringDt getNameElement()
   {
      return adaptedClass.getNameElement();
   }

   public String getName()
   {
      return adaptedClass.getName();
   }

   public IOrganization setName(String param)
   {
      adaptedClass.setName(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IOrganization setName(StringDt param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IOrganization setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public BooleanDt getActiveElement()
   {
      return adaptedClass.getActiveElement();
   }

   public Boolean getActive()
   {
      return adaptedClass.getActive();
   }

   public IOrganization setActive(Boolean param)
   {
      adaptedClass
            .setActive(new ca.uhn.fhir.model.primitive.BooleanDt(param));
      return this;
   }

   public IOrganization setActive(BooleanDt param)
   {
      adaptedClass.setActive(param);
      return this;
   }

   public List<AddressDt> getAddress()
   {
      return adaptedClass.getAddress();
   }

   public IOrganization setAddress(List<AddressDt> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public IOrganization addAddress(AddressDt param)
   {
      adaptedClass.addAddress(param);
      return this;
   }

   public AddressDt addAddress()
   {
      ca.uhn.fhir.model.dstu2.composite.AddressDt item = new ca.uhn.fhir.model.dstu2.composite.AddressDt();
      adaptedClass.addAddress(item);
      return item;
   }

   public AddressDt getAddressFirstRep()
   {
      return adaptedClass.getAddressFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IOrganization setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }
}