package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Resource;
import java.util.List;
import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.StringType;

public class qicorelocationAdapter implements Iqicorelocation
{

   private Location adaptedClass;

   public qicorelocationAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Location();
   }

   public qicorelocationAdapter(Location adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Location getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Location param)
   {
      this.adaptedClass = param;
   }

   public Location.LocationPositionComponent getPosition()
   {
      try
      {
         return adaptedClass.getPosition();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Position", e);
      }
   }

   public qicorelocationAdapter setPosition(
         Location.LocationPositionComponent param)
   {
      adaptedClass.setPosition(param);
      return this;
   }

   public boolean hasPosition()
   {
      return adaptedClass.hasPosition();
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

   public Iqicorelocation setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorelocation addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public Address getAddress()
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

   public qicorelocationAdapter setAddress(Address param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public boolean hasAddress()
   {
      return adaptedClass.hasAddress();
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

   public Iqicorelocation setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorelocation setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public Location.LocationStatus getStatus()
   {
      try
      {
         return adaptedClass.getStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Status", e);
      }
   }

   public Enumeration<Location.LocationStatus> getStatusElement()
   {
      try
      {
         return adaptedClass.getStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusElement", e);
      }
   }

   public Iqicorelocation setStatus(Location.LocationStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicorelocation setStatusElement(
         Enumeration<Location.LocationStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public CodeableConcept getPhysicalType()
   {
      try
      {
         return adaptedClass.getPhysicalType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PhysicalType", e);
      }
   }

   public Iqicorelocation setPhysicalType(CodeableConcept param)
   {
      adaptedClass.setPhysicalType(param);
      return this;
   }

   public boolean hasPhysicalType()
   {
      return adaptedClass.hasPhysicalType();
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

   public Iqicorelocation setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorelocation setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasMode()
   {
      return adaptedClass.hasMode();
   }

   public boolean hasModeElement()
   {
      return adaptedClass.hasModeElement();
   }

   public Location.LocationMode getMode()
   {
      try
      {
         return adaptedClass.getMode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Mode", e);
      }
   }

   public Enumeration<Location.LocationMode> getModeElement()
   {
      try
      {
         return adaptedClass.getModeElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ModeElement", e);
      }
   }

   public Iqicorelocation setMode(Location.LocationMode param)
   {
      adaptedClass.setMode(param);
      return this;
   }

   public Iqicorelocation setModeElement(
         Enumeration<Location.LocationMode> param)
   {
      adaptedClass.setModeElement(param);
      return this;
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

   public Iqicorelocation setPartOf(Reference param)
   {
      adaptedClass.setPartOf(param);
      return this;
   }

   public Location getPartOfTarget()
   {
      return (org.hl7.fhir.dstu3.model.Location) adaptedClass
            .getPartOfTarget();
   }

   public Iqicorelocation setPartOfTarget(Location param)
   {
      adaptedClass.setPartOfTarget(param);
      return this;
   }

   public qicorelocationAdapter getPartOfAdapterTarget()
   {
      if (adaptedClass.getPartOf().getResource() instanceof org.hl7.fhir.dstu3.model.Location)
      {
         qicorelocationAdapter profiledType = new qicorelocationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Location) adaptedClass
                     .getPartOf().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorelocation setPartOfAdapterTarget(qicorelocationAdapter param)
   {
      adaptedClass.setPartOfTarget(param.getAdaptee());
      return this;
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

   public Iqicorelocation setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorelocation setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasManagingOrganization()
   {
      return adaptedClass.hasManagingOrganization();
   }

   public Reference getManagingOrganization()
   {
      try
      {
         return adaptedClass.getManagingOrganization();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ManagingOrganization", e);
      }
   }

   public Iqicorelocation setManagingOrganization(Reference param)
   {
      adaptedClass.setManagingOrganization(param);
      return this;
   }

   public Organization getManagingOrganizationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getManagingOrganizationTarget();
   }

   public Iqicorelocation setManagingOrganizationTarget(Organization param)
   {
      adaptedClass.setManagingOrganizationTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getManagingOrganizationAdapterTarget()
   {
      if (adaptedClass.getManagingOrganization().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         qicoreorganizationAdapter profiledType = new qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getManagingOrganization().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorelocation setManagingOrganizationAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setManagingOrganizationTarget(param.getAdaptee());
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

   public Iqicorelocation setTelecom(List<ContactPoint> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public boolean hasTelecom()
   {
      return adaptedClass.hasTelecom();
   }

   public Iqicorelocation addTelecom(ContactPoint param)
   {
      adaptedClass.addTelecom(param);
      return this;
   }

   public ContactPoint addTelecom()
   {
      return adaptedClass.addTelecom();
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

   public Iqicorelocation setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorelocation addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public boolean hasDescription()
   {
      return adaptedClass.hasDescription();
   }

   public boolean hasDescriptionElement()
   {
      return adaptedClass.hasDescriptionElement();
   }

   public StringType getDescriptionElement()
   {
      try
      {
         return adaptedClass.getDescriptionElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DescriptionElement", e);
      }
   }

   public String getDescription()
   {
      try
      {
         return adaptedClass.getDescription();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Description", e);
      }
   }

   public Iqicorelocation setDescriptionElement(StringType param)
   {
      adaptedClass.setDescriptionElement(param);
      return this;
   }

   public Iqicorelocation setDescription(String param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public boolean hasAlias()
   {
      return adaptedClass.hasAlias();
   }

   public boolean hasAlias(String param)
   {
      return adaptedClass.hasAlias(param);
   }

   public Iqicorelocation addAlias(String param)
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

   public Iqicorelocation setAlias(List<StringType> param)
   {
      adaptedClass.setAlias(param);
      return this;
   }

   public CodeableConcept getType()
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

   public Iqicorelocation setType(CodeableConcept param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
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

   public Iqicorelocation setNameElement(StringType param)
   {
      adaptedClass.setNameElement(param);
      return this;
   }

   public Iqicorelocation setName(String param)
   {
      adaptedClass.setName(param);
      return this;
   }
}