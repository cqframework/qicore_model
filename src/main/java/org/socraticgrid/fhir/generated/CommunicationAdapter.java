package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.ICommunication;
import ca.uhn.fhir.model.dstu2.resource.Communication;
import ca.uhn.fhir.model.primitive.IdDt;
import java.util.List;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class CommunicationAdapter implements ICommunication
{

   private Communication adaptedClass = null;

   public CommunicationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Communication();
   }

   public CommunicationAdapter(Communication adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Communication getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Communication param)
   {
      this.adaptedClass = param;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public ICommunication setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<Communication.Payload> getPayload()
   {
      return adaptedClass.getPayload();
   }

   public ICommunication setPayload(List<Communication.Payload> param)
   {
      adaptedClass.setPayload(param);
      return this;
   }

   public ICommunication addPayload(Communication.Payload param)
   {
      adaptedClass.addPayload(param);
      return this;
   }

   public Communication.Payload addPayload()
   {
      ca.uhn.fhir.model.dstu2.resource.Communication.Payload item = new ca.uhn.fhir.model.dstu2.resource.Communication.Payload();
      adaptedClass.addPayload(item);
      return item;
   }

   public Communication.Payload getPayloadFirstRep()
   {
      return adaptedClass.getPayloadFirstRep();
   }

   public DateTimeDt getSentElement()
   {
      return adaptedClass.getSentElement();
   }

   public Date getSent()
   {
      return adaptedClass.getSent();
   }

   public ICommunication setSent(Date param)
   {
      adaptedClass.setSent(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public ICommunication setSent(DateTimeDt param)
   {
      adaptedClass.setSent(param);
      return this;
   }

   public CommunicationRequest getRequestDetailResource()
   {
      if (adaptedClass.getRequestDetail().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.CommunicationRequest)
      {
         return (ca.uhn.fhir.model.dstu2.resource.CommunicationRequest) adaptedClass
               .getRequestDetail().getResource();
      }
      else
      {
         return null;
      }
   }

   public ICommunication setRequestDetailResource(CommunicationRequest param)
   {
      adaptedClass.getRequestDetail().setResource(param);
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

   public ICommunication setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
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

   public ICommunication setSubjectResource(Patient param)
   {
      adaptedClass.getSubject().setResource(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public ICommunication setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public ICommunication setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public ICommunication setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.CommunicationStatusEnum
                  .valueOf(param));
      return this;
   }

   public ICommunication setStatus(CommunicationStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<CommunicationStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public ICommunication setStatus(BoundCodeDt<CommunicationStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public ICommunication setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public ICommunication setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public ICommunication addIdentifier(IdentifierDt param)
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

   public DateTimeDt getReceivedElement()
   {
      return adaptedClass.getReceivedElement();
   }

   public Date getReceived()
   {
      return adaptedClass.getReceived();
   }

   public ICommunication setReceived(Date param)
   {
      adaptedClass.setReceived(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public ICommunication setReceived(DateTimeDt param)
   {
      adaptedClass.setReceived(param);
      return this;
   }

   public CodeableConceptDt getCategory()
   {
      return adaptedClass.getCategory();
   }

   public ICommunication setCategory(CodeableConceptDt param)
   {
      adaptedClass.setCategory(param);
      return this;
   }
}