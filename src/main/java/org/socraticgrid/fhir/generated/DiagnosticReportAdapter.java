package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IDiagnosticReport;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticReport;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import java.util.Date;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticReportStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class DiagnosticReportAdapter implements IDiagnosticReport
{

   private DiagnosticReport adaptedClass = null;

   public DiagnosticReportAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.DiagnosticReport();
   }

   public DiagnosticReportAdapter(DiagnosticReport adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public DiagnosticReport getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(DiagnosticReport param)
   {
      this.adaptedClass = param;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IDiagnosticReport setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IDiagnosticReport addIdentifier(IdentifierDt param)
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

   public InstantDt getIssuedElement()
   {
      return adaptedClass.getIssuedElement();
   }

   public Date getIssued()
   {
      return adaptedClass.getIssued();
   }

   public IDiagnosticReport setIssued(Date param)
   {
      adaptedClass
            .setIssued(new ca.uhn.fhir.model.primitive.InstantDt(param));
      return this;
   }

   public IDiagnosticReport setIssued(InstantDt param)
   {
      adaptedClass.setIssued(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IDiagnosticReport setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<DiagnosticReport.Image> getImage()
   {
      return adaptedClass.getImage();
   }

   public IDiagnosticReport setImage(List<DiagnosticReport.Image> param)
   {
      adaptedClass.setImage(param);
      return this;
   }

   public IDiagnosticReport addImage(DiagnosticReport.Image param)
   {
      adaptedClass.addImage(param);
      return this;
   }

   public DiagnosticReport.Image addImage()
   {
      ca.uhn.fhir.model.dstu2.resource.DiagnosticReport.Image item = new ca.uhn.fhir.model.dstu2.resource.DiagnosticReport.Image();
      adaptedClass.addImage(item);
      return item;
   }

   public DiagnosticReport.Image getImageFirstRep()
   {
      return adaptedClass.getImageFirstRep();
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

   public IDiagnosticReport setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public List<AttachmentDt> getPresentedForm()
   {
      return adaptedClass.getPresentedForm();
   }

   public IDiagnosticReport setPresentedForm(List<AttachmentDt> param)
   {
      adaptedClass.setPresentedForm(param);
      return this;
   }

   public IDiagnosticReport addPresentedForm(AttachmentDt param)
   {
      adaptedClass.addPresentedForm(param);
      return this;
   }

   public AttachmentDt addPresentedForm()
   {
      ca.uhn.fhir.model.dstu2.composite.AttachmentDt item = new ca.uhn.fhir.model.dstu2.composite.AttachmentDt();
      adaptedClass.addPresentedForm(item);
      return item;
   }

   public AttachmentDt getPresentedFormFirstRep()
   {
      return adaptedClass.getPresentedFormFirstRep();
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public IDiagnosticReport setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public CodeableConceptDt getCategory()
   {
      return adaptedClass.getCategory();
   }

   public IDiagnosticReport setCategory(CodeableConceptDt param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IDiagnosticReport setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.DiagnosticReportStatusEnum
                  .valueOf(param));
      return this;
   }

   public IDiagnosticReport setStatus(DiagnosticReportStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<DiagnosticReportStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IDiagnosticReport setStatus(
         BoundCodeDt<DiagnosticReportStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IDiagnosticReport setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IDiagnosticReport setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public StringDt getConclusionElement()
   {
      return adaptedClass.getConclusionElement();
   }

   public String getConclusion()
   {
      return adaptedClass.getConclusion();
   }

   public IDiagnosticReport setConclusion(String param)
   {
      adaptedClass.setConclusion(new ca.uhn.fhir.model.primitive.StringDt(
            param));
      return this;
   }

   public IDiagnosticReport setConclusion(StringDt param)
   {
      adaptedClass.setConclusion(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IDiagnosticReport setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
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

   public IDiagnosticReport setEffectiveDateTime(DateTimeDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public IDiagnosticReport setEffectiveDateTime(Date param)
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

   public IDiagnosticReport setEffectivePeriod(PeriodDt param)
   {
      adaptedClass.setEffective(param);
      return this;
   }
}