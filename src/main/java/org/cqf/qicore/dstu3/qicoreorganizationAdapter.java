package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Address;
import java.util.List;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.lang.Boolean;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.IdType;

public class qicoreorganizationAdapter implements Iqicoreorganization
{

   private Organization adaptedClass;

   public qicoreorganizationAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Organization();
   }

   public qicoreorganizationAdapter(Organization adaptee)
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

   public boolean hasPartOf()
   {
      return adaptedClass.hasPartOf();
   }

   public Reference getPartOf()
   {
      try
      {
         return adaptedClass.getPartOf();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PartOf", e);
      }
   }

   public Iqicoreorganization setPartOf(Reference param)
   {
      adaptedClass.setPartOf(param);
      return this;
   }

   public Organization getPartOfTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getPartOfTarget();
   }

   public Iqicoreorganization setPartOfTarget(Organization param)
   {
      adaptedClass.setPartOfTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getPartOfAdapterTarget()
   {
      if (adaptedClass.getPartOf().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         qicoreorganizationAdapter profiledType = new qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getPartOf().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreorganization setPartOfAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setPartOfTarget(param.getAdaptee());
      return this;
   }

   public List<Address> getAddress()
   {
      try
      {
         return adaptedClass.getAddress();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Address", e);
      }
   }

   public qicoreorganizationAdapter setAddress(List<Address> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public boolean hasAddress()
   {
      return adaptedClass.hasAddress();
   }

   public qicoreorganizationAdapter addAddress(Address param)
   {
      adaptedClass.addAddress(param);
      return this;
   }

   public Address addAddress()
   {
      return adaptedClass.addAddress();
   }

   public boolean hasName()
   {
      return adaptedClass.hasName();
   }

   public boolean hasNameElement()
   {
      return adaptedClass.hasNameElement();
   }

   public StringType getNameElement()
   {
      try
      {
         return adaptedClass.getNameElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting NameElement", e);
      }
   }

   public String getName()
   {
      try
      {
         return adaptedClass.getName();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Name", e);
      }
   }

   public Iqicoreorganization setNameElement(StringType param)
   {
      adaptedClass.setNameElement(param);
      return this;
   }

   public Iqicoreorganization setName(String param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public List<Organization.OrganizationContactComponent> getContact()
   {
      try
      {
         return adaptedClass.getContact();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Contact", e);
      }
   }

   public qicoreorganizationAdapter setContact(
         List<Organization.OrganizationContactComponent> param)
   {
      adaptedClass.setContact(param);
      return this;
   }

   public boolean hasContact()
   {
      return adaptedClass.hasContact();
   }

   public qicoreorganizationAdapter addContact(
         Organization.OrganizationContactComponent param)
   {
      adaptedClass.addContact(param);
      return this;
   }

   public Organization.OrganizationContactComponent addContact()
   {
      return adaptedClass.addContact();
   }

   public boolean hasActive()
   {
      return adaptedClass.hasActive();
   }

   public boolean hasActiveElement()
   {
      return adaptedClass.hasActiveElement();
   }

   public BooleanType getActiveElement()
   {
      try
      {
         return adaptedClass.getActiveElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ActiveElement", e);
      }
   }

   public Boolean getActive()
   {
      try
      {
         return adaptedClass.getActive();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Active", e);
      }
   }

   public Iqicoreorganization setActiveElement(BooleanType param)
   {
      adaptedClass.setActiveElement(param);
      return this;
   }

   public Iqicoreorganization setActive(Boolean param)
   {
      adaptedClass.setActive(param);
      return this;
   }

   public boolean hasEndpoint()
   {
      return adaptedClass.hasEndpoint();
   }

   public List<Reference> getEndpoint()
   {
      return adaptedClass.getEndpoint();
   }

   public List<Identifier> getIdentifier()
   {
      try
      {
         return adaptedClass.getIdentifier();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Identifier", e);
      }
   }

   public Iqicoreorganization setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreorganization addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public boolean hasAlias()
   {
      return adaptedClass.hasAlias();
   }

   public boolean hasAlias(String param)
   {
      return adaptedClass.hasAlias(param);
   }

   public Iqicoreorganization addAlias(String param)
   {
      adaptedClass.addAlias(param);
      return this;
   }

   public StringType addAliasElement()
   {
      return adaptedClass.addAliasElement();
   }

   public List<StringType> getAlias()
   {
      try
      {
         return adaptedClass.getAlias();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Alias", e);
      }
   }

   public Iqicoreorganization setAlias(List<StringType> param)
   {
      adaptedClass.setAlias(param);
      return this;
   }

   public List<CodeableConcept> getType()
   {
      try
      {
         return adaptedClass.getType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Type", e);
      }
   }

   public Iqicoreorganization setType(List<CodeableConcept> param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
   }

   public boolean hasLanguage()
   {
      return adaptedClass.hasLanguage();
   }

   public boolean hasLanguageElement()
   {
      return adaptedClass.hasLanguageElement();
   }

   public CodeType getLanguageElement()
   {
      try
      {
         return adaptedClass.getLanguageElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LanguageElement", e);
      }
   }

   public String getLanguage()
   {
      try
      {
         return adaptedClass.getLanguage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Language", e);
      }
   }

   public Iqicoreorganization setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreorganization setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<ContactPoint> getTelecom()
   {
      try
      {
         return adaptedClass.getTelecom();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Telecom", e);
      }
   }

   public Iqicoreorganization setTelecom(List<ContactPoint> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public boolean hasTelecom()
   {
      return adaptedClass.hasTelecom();
   }

   public Iqicoreorganization addTelecom(ContactPoint param)
   {
      adaptedClass.addTelecom(param);
      return this;
   }

   public ContactPoint addTelecom()
   {
      return adaptedClass.addTelecom();
   }

   public List<Resource> getContained()
   {
      try
      {
         return adaptedClass.getContained();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Contained", e);
      }
   }

   public Iqicoreorganization setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreorganization addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public boolean hasImplicitRules()
   {
      return adaptedClass.hasImplicitRules();
   }

   public boolean hasImplicitRulesElement()
   {
      return adaptedClass.hasImplicitRulesElement();
   }

   public UriType getImplicitRulesElement()
   {
      try
      {
         return adaptedClass.getImplicitRulesElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRulesElement", e);
      }
   }

   public String getImplicitRules()
   {
      try
      {
         return adaptedClass.getImplicitRules();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRules", e);
      }
   }

   public Iqicoreorganization setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreorganization setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public IdType getIdElement()
   {
      try
      {
         return adaptedClass.getIdElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IdElement", e);
      }
   }

   public String getId()
   {
      try
      {
         return adaptedClass.getId();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Id", e);
      }
   }

   public Iqicoreorganization setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreorganization setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }
}
