package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IReferralRequest;
import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class ReferralRequestAdapter implements IReferralRequest
{

   private ReferralRequest adaptedClass = null;

   public ReferralRequestAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.ReferralRequest();
   }

   public ReferralRequestAdapter(ReferralRequest adaptee)
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

   public IReferralRequest setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IReferralRequest setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum
                  .valueOf(param));
      return this;
   }

   public IReferralRequest setStatus(ReferralStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<ReferralStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IReferralRequest setStatus(BoundCodeDt<ReferralStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Patient getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
               .getPatient().getResource();
      }
      else
      {
         return null;
      }
   }

   public IReferralRequest setPatientResource(Patient param)
   {
      adaptedClass.getPatient().setResource(param);
      return this;
   }

   public CodeableConceptDt getSpecialty()
   {
      return adaptedClass.getSpecialty();
   }

   public IReferralRequest setSpecialty(CodeableConceptDt param)
   {
      adaptedClass.setSpecialty(param);
      return this;
   }

   public PeriodDt getFulfillmentTime()
   {
      return adaptedClass.getFulfillmentTime();
   }

   public IReferralRequest setFulfillmentTime(PeriodDt param)
   {
      adaptedClass.setFulfillmentTime(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IReferralRequest setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConceptDt getPriority()
   {
      return adaptedClass.getPriority();
   }

   public IReferralRequest setPriority(CodeableConceptDt param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public Encounter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
               .getEncounter().getResource();
      }
      else
      {
         return null;
      }
   }

   public IReferralRequest setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
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

   public IReferralRequest setDate(Date param)
   {
      adaptedClass.setDate(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public IReferralRequest setDate(DateTimeDt param)
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

   public IReferralRequest setDateSent(Date param)
   {
      adaptedClass.setDateSent(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IReferralRequest setDateSent(DateTimeDt param)
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

   public IReferralRequest setDescription(String param)
   {
      adaptedClass.setDescription(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IReferralRequest setDescription(StringDt param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IReferralRequest setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public CodeableConceptDt getReason()
   {
      return adaptedClass.getReason();
   }

   public IReferralRequest setReason(CodeableConceptDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IReferralRequest setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeableConceptDt getType()
   {
      return adaptedClass.getType();
   }

   public IReferralRequest setType(CodeableConceptDt param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IReferralRequest setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IReferralRequest addIdentifier(IdentifierDt param)
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