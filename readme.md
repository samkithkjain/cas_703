# CAS 703 - Software Design Project Winter 2024 McMaster University 

## Introduction
Welcome to the world of the Carnivals, a vibrant celebration that captivates hearts and sparks joy. Carnivals are festive gatherings that draw people from far and wide, offering a range of entertainment and excitement. In the spirit of embracing this joyful atmosphere, a domain-specific language using Epsilon has been designed to capture the essence of Carnivals through metamodelling.

## Metamodelling
To model the dynamic aspects of the Carnival, Emfatic has been employed to generate an Ecore model. The design encompasses fundamental elements that define the carnival experience, ranging from diverse activities to enthusiastic participants. The metamodelling approach is structured as follows:

### Class Diagram
1. **NamedElement:** An abstract class serving as the foundation for naming various elements within the carnival.
2. **Activity:** An abstract class capturing the diverse range of activities present at the carnival.
3. **Event:** A type of activity open to all carnival attendees.
4. **Booth:** A type of activity with limited resources, offering unique experiences.
5. **Participant:** An abstract class encompassing the different individuals engaged in the carnival.
6. **Visitor:** Class representing attendees who join the carnival as visitors, embracing the fun-filled spirit.
7. **Volunteer:** Class representing attendees who actively contribute as volunteers, enhancing the carnival experience.
8. **CarnivalDay:** Class defining a specific day within the carnival, comprising a variety of engaging activities.
9. **Carnival:** Base class encapsulating the entire carnival celebration, composed of carnival days and diverse participants.

<figure>
  <img src="./cas703.impl.carnival/model/carnival%20class%20diagram.jpg" alt="Carnival Image">
  <figcaption style="text-align:center;">Figure 1: Class Diagram</figcaption>
</figure>


This metamodelling structure forms the framework for a comprehensive representation of the Carnival, offering flexibility and customization based on the unique characteristics of your specific carnival celebration. Additional details, associations, and constraints can be incorporated to tailor the model to your project's requirements.

## Contributors
- Amin Toloekashefpakdel (toloekaa@mcmaster.ca)
- Nivetha Raj Pappuraj (pappuran@mcmaster.ca)
- Samkith K Jain (kishors@mcmaster.ca)
- Sana Ishtiaq (ishtis3@mcmaster.ca)