//import { data } from "cypress/types/jquery"

describe('Demo', function () {


    it("Visit Url And Assert Logo", () => {

        cy.fixture('testdata.json').then((data) => {
            cy.visit(data.Url)
            cy.get('header > a > img').should('be.visible')
        })
    })
    it('Click On Third Card', () => {
        cy.get(':nth-child(3) > :nth-child(1) > .card-up').click()
        cy.get(':nth-child(3) > .element-list > .menu-list > #item-1 > .text').click()
        Cypress.on('uncaught:exception', (err, runnable) => {
            return false
        })
    })
    it('Click On Cancel Button ', () => {

        cy.get('#confirmButton').click()
        cy.on('window:confirm', () => false)
        cy.get('#confirmResult').then( (text)=> {
            var newText = text.text()
            cy.log(newText)
        })
    })
    it('Scroll Till Element', () => {
        cy.get(':nth-child(6) > .group-header > .header-wrapper > .header-text').scrollIntoView()
    })
    it('Login ', function () {

        cy.xpath("//div[contains(text(),'Book Store Application')]").should('be.visible').click({ force: true })
        cy.get('.text').contains('Login').click()
        //cy.get('#userName').type('abcd@gmail.com')
        cy.fixture('testdata.json').then((data) => {

            cy.get('#userName').type(data.Username)
            cy.get('#password').type(data.passsword)

            cy.get('#login').click()
        })


    })
})

