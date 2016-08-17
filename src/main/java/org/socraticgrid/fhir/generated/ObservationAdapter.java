package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IObservation;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.Specimen;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.dstu2.composite.RatioDt;
import ca.uhn.fhir.model.dstu2.composite.SampledDataDt;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.primitive.TimeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class ObservationAdapter implements IObservation
{

   private Observation adaptedClass = null;

   public ObservationAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Observation();
   }

   public ObservationAdapter(Observation adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Observation getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Observation param)
   {
      this.adaptedClass = param;
   }

   public List<Observation.Related> getRelated()
   {
      return adaptedClass.getRelated();
   }

   public IObservation setRelated(List<Observation.Related> param)
   {
      adaptedClass.setRelated(param);
      return this;
   }

   public IObservation addRelated(Observation.Related param)
   {
      adaptedClass.addRelated(param);
      return this;
   }

   public Observation.Related addRelated()
   {
      ca.uhn.fhir.model.dstu2.resource.Observation.Related item = new ca.uhn.fhir.model.dstu2.resource.Observation.Related();
      adaptedClass.addRelated(item);
      return item;
   }

   public Observation.Related getRelatedFirstRep()
   {
      return adaptedClass.getRelatedFirstRep();
   }

   public List<Observation.Component> getComponent()
   {
      return adaptedClass.getComponent();
   }

   public IObservation setComponent(List<Observation.Component> param)
   {
      adaptedClass.setComponent(param);
      return this;
   }

   public IObservation addComponent(Observation.Component param)
   {
      adaptedClass.addComponent(param);
      return this;
   }

   public Observation.Component addComponent()
   {
      ca.uhn.fhir.model.dstu2.resource.Observation.Component item = new ca.uhn.fhir.model.dstu2.resource.Observation.Component();
      adaptedClass.addComponent(item);
      return item;
   }

   public Observation.Component getComponentFirstRep()
   {
      return adaptedClass.getComponentFirstRep();
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IObservation setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IObservation setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IObservation addIdentifier(IdentifierDt param)
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

   public List<Observation.ReferenceRange> getReferenceRange()
   {
      return adaptedClass.getReferenceRange();
   }

   public IObservation setReferenceRange(List<Observation.ReferenceRange> param)
   {
      adaptedClass.setReferenceRange(param);
      return this;
   }

   public IObservation addReferenceRange(Observation.ReferenceRange param)
   {
      adaptedClass.addReferenceRange(param);
      return this;
   }

   public Observation.ReferenceRange addReferenceRange()
   {
      ca.uhn.fhir.model.dstu2.resource.Observation.ReferenceRange item = new ca.uhn.fhir.model.dstu2.resource.Observation.ReferenceRange();
      adaptedClass.addReferenceRange(item);
      return item;
   }

   public Observation.ReferenceRange getReferenceRangeFirstRep()
   {
      return adaptedClass.getReferenceRangeFirstRep();
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IObservation setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IObservation setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConceptDt getMethod()
   {
      return adaptedClass.getMethod();
   }

   public IObservation setMethod(CodeableConceptDt param)
   {
      adaptedClass.setMethod(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IObservation setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum
                  .valueOf(param));
      return this;
   }

   public IObservation setStatus(ObservationStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<ObservationStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IObservation setStatus(BoundCodeDt<ObservationStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public StringDt getCommentsElement()
   {
      return adaptedClass.getCommentsElement();
   }

   public String getComments()
   {
      return adaptedClass.getComments();
   }

   public IObservation setComments(String param)
   {
      adaptedClass
            .setComments(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IObservation setComments(StringDt param)
   {
      adaptedClass.setComments(param);
      return this;
   }

   public CodeableConceptDt getDataAbsentReason()
   {
      return adaptedClass.getDataAbsentReason();
   }

   public IObservation setDataAbsentReason(CodeableConceptDt param)
   {
      adaptedClass.setDataAbsentReason(param);
      return this;
   }

   public InstantDt getIssuedElement()
   {
      return adaptedClass.getIssuedElement();
   }

   public Date getIssued()
   {
      return adaptedClass.getIssued();
   }

   public IObservation setIssued(Date param)
   {
      adaptedClass
            .setIssued(new ca.uhn.fhir.model.primitive.InstantDt(param));
      return this;
   }

   public IObservation setIssued(InstantDt param)
   {
      adaptedClass.setIssued(param);
      return this;
   }

   public Specimen getSpecimenResource()
   {
      if (adaptedClass.getSpecimen().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Specimen)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Specimen) adaptedClass
               .getSpecimen().getResource();
      }
      else
      {
         return null;
      }
   }

   public IObservation setSpecimenResource(Specimen param)
   {
      adaptedClass.getSpecimen().setResource(param);
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

   public IObservation setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IObservation setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeableConceptDt getInterpretation()
   {
      return adaptedClass.getInterpretation();
   }

   public IObservation setInterpretation(CodeableConceptDt param)
   {
      adaptedClass.setInterpretation(param);
      return this;
   }

   public CodeableConceptDt getCategory()
   {
      return adaptedClass.getCategory();
   }

   public IObservation setCategory(CodeableConceptDt param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IObservation setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConceptDt getBodySite()
   {
      return adaptedClass.getBodySite();
   }

   public IObservation setBodySite(CodeableConceptDt param)
   {
      adaptedClass.setBodySite(param);
      return this;
   }

   public QuantityDt getValueQuantity()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.QuantityDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.QuantityDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueQuantity(QuantityDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public BoundCodeableConceptDt getValueCodeableConcept()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueCodeableConcept(BoundCodeableConceptDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public StringDt getValueStringElement()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return (ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public String getValueString()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.StringDt)
      {
         return ((ca.uhn.fhir.model.primitive.StringDt) adaptedClass
               .getValue()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueString(StringDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public IObservation setValueString(String param)
   {
      adaptedClass.setValue(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public RangeDt getValueRange()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.RangeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RangeDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueRange(RangeDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public RatioDt getValueRatio()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.RatioDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RatioDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueRatio(RatioDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public SampledDataDt getValueSampledData()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.SampledDataDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.SampledDataDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueSampledData(SampledDataDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public AttachmentDt getValueAttachment()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.AttachmentDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.AttachmentDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueAttachment(AttachmentDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public TimeDt getValueTimeElement()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.TimeDt)
      {
         return (ca.uhn.fhir.model.primitive.TimeDt) adaptedClass.getValue();
      }
      else
      {
         return null;
      }
   }

   public String getValueTime()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.TimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.TimeDt) adaptedClass
               .getValue()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueTime(TimeDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public IObservation setValueTime(String param)
   {
      adaptedClass.setValue(new ca.uhn.fhir.model.primitive.TimeDt(param));
      return this;
   }

   public DateTimeDt getValueDateTimeElement()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public Date getValueDateTime()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getValue()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValueDateTime(DateTimeDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public IObservation setValueDateTime(Date param)
   {
      adaptedClass
            .setValue(new ca.uhn.fhir.model.primitive.DateTimeDt(param));
      return this;
   }

   public PeriodDt getValuePeriod()
   {
      if (adaptedClass.getValue() != null
            && adaptedClass.getValue() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setValuePeriod(PeriodDt param)
   {
      adaptedClass.setValue(param);
      return this;
   }

   public DateTimeDt getEffectiveDateTimeElement()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getEffective();
      }
      else
      {
         return null;
      }
   }

   public Date getEffectiveDateTime()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getEffective()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IObservation setEffectiveDateTime(DateTimeDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public IObservation setEffectiveDateTime(Date param)
   {
      adaptedClass.setEffective(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public PeriodDt getEffectivePeriod()
   {
      if (adaptedClass.getEffective() != null
            && adaptedClass.getEffective() instanceof ca.uhn.fhir.model.dstu2.composite.PeriodDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.PeriodDt) adaptedClass
               .getEffective();
      }
      else
      {
         return null;
      }
   }

   public IObservation setEffectivePeriod(PeriodDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }
}