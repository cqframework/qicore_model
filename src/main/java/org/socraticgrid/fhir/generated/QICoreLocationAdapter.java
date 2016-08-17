package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreLocation;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.valueset.LocationStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.valueset.LocationModeEnum;
import ca.uhn.fhir.model.primitive.CodeDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.valueset.LocationTypeEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreLocationAdapter implements IQICoreLocation
{

   private Location adaptedClass = null;

   public QICoreLocationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Location();
   }

   public QICoreLocationAdapter(Location adaptee)
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

   public Location.Position getPosition()
   {
      return adaptedClass.getPosition();
   }

   public IQICoreLocation setPosition(Location.Position param)
   {
      adaptedClass.setPosition(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreLocation setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public AddressDt getAddress()
   {
      return adaptedClass.getAddress();
   }

   public IQICoreLocation setAddress(AddressDt param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreLocation setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.LocationStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreLocation setStatus(LocationStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<LocationStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreLocation setStatus(BoundCodeDt<LocationStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public CodeableConceptDt getPhysicalType()
   {
      return adaptedClass.getPhysicalType();
   }

   public IQICoreLocation setPhysicalType(CodeableConceptDt param)
   {
      adaptedClass.setPhysicalType(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreLocation setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreLocation setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public String getMode()
   {
      return adaptedClass.getMode();
   }

   public IQICoreLocation setMode(String param)
   {
      adaptedClass.setMode(ca.uhn.fhir.model.dstu2.valueset.LocationModeEnum
            .valueOf(param));
      return this;
   }

   public IQICoreLocation setMode(LocationModeEnum param)
   {
      adaptedClass.setMode(param);
      return this;
   }

   public BoundCodeDt<LocationModeEnum> getModeElement()
   {
      return adaptedClass.getModeElement();
   }

   public IQICoreLocation setMode(BoundCodeDt<LocationModeEnum> param)
   {
      adaptedClass.setMode(param);
      return this;
   }

   public QICoreLocationAdapter getPartOfResource()
   {
      if (adaptedClass.getPartOf().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Location)
      {
         org.socraticgrid.fhir.generated.QICoreLocationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreLocationAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Location) adaptedClass
                     .getPartOf().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreLocation setPartOfResource(QICoreLocationAdapter param)
   {
      adaptedClass.getPartOf().setResource(param.getAdaptee());
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreLocation setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public QICoreOrganizationAdapter getManagingOrganizationResource()
   {
      if (adaptedClass.getManagingOrganization().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         org.socraticgrid.fhir.generated.QICoreOrganizationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreOrganizationAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
                     .getManagingOrganization().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreLocation setManagingOrganizationResource(
         QICoreOrganizationAdapter param)
   {
      adaptedClass.getManagingOrganization().setResource(param.getAdaptee());
      return this;
   }

   public List<ContactPointDt> getTelecom()
   {
      return adaptedClass.getTelecom();
   }

   public IQICoreLocation setTelecom(List<ContactPointDt> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public IQICoreLocation addTelecom(ContactPointDt param)
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

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreLocation setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreLocation addIdentifier(IdentifierDt param)
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

   public StringDt getDescriptionElement()
   {
      return adaptedClass.getDescriptionElement();
   }

   public String getDescription()
   {
      return adaptedClass.getDescription();
   }

   public IQICoreLocation setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IQICoreLocation setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public BoundCodeableConceptDt<LocationTypeEnum> getType()
   {
      return adaptedClass.getType();
   }

   public IQICoreLocation setType(
         BoundCodeableConceptDt<LocationTypeEnum> param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public StringDt getNameElement()
   {
      return adaptedClass.getNameElement();
   }

   public String getName()
   {
      return adaptedClass.getName();
   }

   public IQICoreLocation setName(String param)
   {
      adaptedClass.setName(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IQICoreLocation setName(StringDt param)
   {
      adaptedClass.setName(param);
      return this;
   }
}