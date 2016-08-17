package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreCommunicationRequest;
import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import java.util.List;
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

public class QICoreCommunicationRequestAdapter implements IQICoreCommunicationRequest
{

   private CommunicationRequest adaptedClass = null;

   public QICoreCommunicationRequestAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.CommunicationRequest();
   }

   public QICoreCommunicationRequestAdapter(CommunicationRequest adaptee)
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

   public IQICoreCommunicationRequest setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreCommunicationRequest setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConceptDt getReasonRejected()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/communicationrequest-reasonRejected");
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
               "More than one extension exists for reasonRejected");
      }
   }

   public IQICoreCommunicationRequest setReasonRejected(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/communicationrequest-reasonRejected",
                  param);
      return this;
   }

   public List<CommunicationRequest.Payload> getPayload()
   {
      return adaptedClass.getPayload();
   }

   public IQICoreCommunicationRequest setPayload(
         List<CommunicationRequest.Payload> param)
   {
      adaptedClass.setPayload(param);
      return this;
   }

   public IQICoreCommunicationRequest addPayload(
         CommunicationRequest.Payload param)
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

   public IQICoreCommunicationRequest setPriority(CodeableConceptDt param)
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

   public IQICoreCommunicationRequest setEncounterResource(
         QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
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

   public IQICoreCommunicationRequest setRequestedOn(Date param)
   {
      adaptedClass.setRequestedOn(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IQICoreCommunicationRequest setRequestedOn(DateTimeDt param)
   {
      adaptedClass.setRequestedOn(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreCommunicationRequest setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.CommunicationRequestStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreCommunicationRequest setStatus(
         CommunicationRequestStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<CommunicationRequestStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreCommunicationRequest setStatus(
         BoundCodeDt<CommunicationRequestStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreCommunicationRequest setText(NarrativeDt param)
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

   public IQICoreCommunicationRequest setSubjectResource(Patient param)
   {
      adaptedClass.getSubject().setResource(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreCommunicationRequest setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreCommunicationRequest addIdentifier(IdentifierDt param)
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

   public IQICoreCommunicationRequest setCategory(CodeableConceptDt param)
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

   public IQICoreCommunicationRequest setScheduledDateTime(DateTimeDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public IQICoreCommunicationRequest setScheduledDateTime(Date param)
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

   public IQICoreCommunicationRequest setScheduledPeriod(PeriodDt param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreCommunicationRequest setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }
}