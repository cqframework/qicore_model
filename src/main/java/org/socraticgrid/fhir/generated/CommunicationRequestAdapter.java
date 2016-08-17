package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.ICommunicationRequest;
import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationRequestStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class CommunicationRequestAdapter implements ICommunicationRequest
{

   private CommunicationRequest adaptedClass = null;

   public CommunicationRequestAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.CommunicationRequest();
   }

   public CommunicationRequestAdapter(CommunicationRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public CommunicationRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(CommunicationRequest param)
   {
      this.adaptedClass = param;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public ICommunicationRequest setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public ICommunicationRequest setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<CommunicationRequest.Payload> getPayload()
   {
      return adaptedClass.getPayload();
   }

   public ICommunicationRequest setPayload(
         List<CommunicationRequest.Payload> param)
   {
      adaptedClass.setPayload(param);
      return this;
   }

   public ICommunicationRequest addPayload(CommunicationRequest.Payload param)
   {
      adaptedClass.addPayload(param);
      return this;
   }

   public CommunicationRequest.Payload addPayload()
   {
      ca.uhn.fhir.model.dstu2.resource.CommunicationRequest.Payload item = new ca.uhn.fhir.model.dstu2.resource.CommunicationRequest.Payload();
      adaptedClass.addPayload(item);
      return item;
   }

   public CommunicationRequest.Payload getPayloadFirstRep()
   {
      return adaptedClass.getPayloadFirstRep();
   }

   public CodeableConceptDt getPriority()
   {
      return adaptedClass.getPriority();
   }

   public ICommunicationRequest setPriority(CodeableConceptDt param)
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

   public ICommunicationRequest setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public DateTimeDt getRequestedOnElement()
   {
      return adaptedClass.getRequestedOnElement();
   }

   public Date getRequestedOn()
   {
      return adaptedClass.getRequestedOn();
   }

   public ICommunicationRequest setRequestedOn(Date param)
   {
      adaptedClass.setRequestedOn(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public ICommunicationRequest setRequestedOn(DateTimeDt param)
   {
      adaptedClass.setRequestedOn(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public ICommunicationRequest setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.CommunicationRequestStatusEnum
                  .valueOf(param));
      return this;
   }

   public ICommunicationRequest setStatus(CommunicationRequestStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<CommunicationRequestStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public ICommunicationRequest setStatus(
         BoundCodeDt<CommunicationRequestStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public ICommunicationRequest setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public Patient getSubjectResource()
   {
      if (adaptedClass.getSubject().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
               .getSubject().getResource();
      }
      else
      {
         return null;
      }
   }

   public ICommunicationRequest setSubjectResource(Patient param)
   {
      adaptedClass.getSubject().setResource(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public ICommunicationRequest setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public ICommunicationRequest addIdentifier(IdentifierDt param)
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

   public CodeableConceptDt getCategory()
   {
      return adaptedClass.getCategory();
   }

   public ICommunicationRequest setCategory(CodeableConceptDt param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public DateTimeDt getScheduledDateTimeElement()
   {
      if (adaptedClass.getScheduled() != null
            && adaptedClass.getScheduled() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getScheduled();
      }
      else
      {
         return null;
      }
   }

   public Date getScheduledDateTime()
   {
      if (adaptedClass.getScheduled() != null
            && adaptedClass.getScheduled() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getScheduled()).getValue();
      }
      else
      {
         return null;
      }
   }

   public ICommunicationRequest setScheduledDateTime(DateTimeDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public ICommunicationRequest setScheduledDateTime(Date param)
   {
      adaptedClass.setScheduled(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public PeriodDt getScheduledPeriod()
   {
      if (adaptedClass.getScheduled() != null
            && adaptedClass.getScheduled() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getScheduled();
      }
      else
      {
         return null;
      }
   }

   public ICommunicationRequest setScheduledPeriod(PeriodDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public ICommunicationRequest setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }
}