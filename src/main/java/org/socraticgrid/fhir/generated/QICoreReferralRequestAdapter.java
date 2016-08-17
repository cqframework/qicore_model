package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreReferralRequest;
import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreReferralRequestAdapter implements IQICoreReferralRequest
{

   private ReferralRequest adaptedClass = null;

   public QICoreReferralRequestAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.ReferralRequest();
   }

   public QICoreReferralRequestAdapter(ReferralRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ReferralRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ReferralRequest param)
   {
      this.adaptedClass = param;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreReferralRequest setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreReferralRequest setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreReferralRequest setStatus(ReferralStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<ReferralStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreReferralRequest setStatus(
         BoundCodeDt<ReferralStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public QICorePatientAdapter getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreReferralRequest setPatientResource(QICorePatientAdapter param)
   {
      adaptedClass.getPatient().setResource(param.getAdaptee());
      return this;
   }

   public CodeableConceptDt getSpecialty()
   {
      return adaptedClass.getSpecialty();
   }

   public IQICoreReferralRequest setSpecialty(CodeableConceptDt param)
   {
      adaptedClass.setSpecialty(param);
      return this;
   }

   public PeriodDt getFulfillmentTime()
   {
      return adaptedClass.getFulfillmentTime();
   }

   public IQICoreReferralRequest setFulfillmentTime(PeriodDt param)
   {
      adaptedClass.setFulfillmentTime(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreReferralRequest setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConceptDt getReasonRefused()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/referralrequest-reasonRefused");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reasonRefused");
      }
   }

   public IQICoreReferralRequest setReasonRefused(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/referralrequest-reasonRefused",
                  param);
      return this;
   }

   public CodeableConceptDt getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IQICoreReferralRequest setPriority(CodeableConceptDt param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreReferralRequest setEncounterResource(
         QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public DateTimeDt getDateElement()
   {
      return adaptedClass.getDateElement();
   }

   public Date getDate()
   {
      return adaptedClass.getDate();
   }

   public IQICoreReferralRequest setDate(Date param)
   {
      adaptedClass.setDate(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public IQICoreReferralRequest setDate(DateTimeDt param)
   {
      adaptedClass.setDate(param);
      return this;
   }

   public DateTimeDt getDateSentElement()
   {
      return adaptedClass.getDateSentElement();
   }

   public Date getDateSent()
   {
      return adaptedClass.getDateSent();
   }

   public IQICoreReferralRequest setDateSent(Date param)
   {
      adaptedClass.setDateSent(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IQICoreReferralRequest setDateSent(DateTimeDt param)
   {
      adaptedClass.setDateSent(param);
      return this;
   }

   public StringDt getDescriptionElement()
   {
      return adaptedClass.getDescriptionElement();
   }

   public String getDescription()
   {
      return adaptedClass.getDescription();
   }

   public IQICoreReferralRequest setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IQICoreReferralRequest setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreReferralRequest setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public CodeableConceptDt getReason()
   {
      return adaptedClass.getReason();
   }

   public IQICoreReferralRequest setReason(CodeableConceptDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreReferralRequest setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeableConceptDt getType()
   {
      return adaptedClass.getType();
   }

   public IQICoreReferralRequest setType(CodeableConceptDt param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreReferralRequest setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreReferralRequest addIdentifier(IdentifierDt param)
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
}