
import { BaseHands, BaseEyes, BaseDependencies } from './BaseRobot';


const size_M = ':nth-child(4) > label > .checkmark'
const size_XS = ':nth-child(2) > label > .checkmark'
const size_XL = ':nth-child(7) > label > .checkmark'

export class Dependencies extends BaseDependencies {
    // visitShoppingCart() {
    //     this.accessUrl('https://react-shopping-cart-67954.firebaseapp.com/');
    // }   
}
export class RobotEyes extends BaseEyes {
    seesMainPage() {
        this.seesTextWithClass('sc-bj2vay-2', 'Sizes:')
    }

    seesCartPage() {
        this.seesTextWithClass('sc-1h98xa9-3', "1")
    }

    seesSizeM() {
        this.seesDomContainText('.sc-ebmerl-4 > p', '1')
    }
    seesSizeXS() {
        this.seesDomContainText('.sc-ebmerl-4 > p', '1')
    }
    seesSizeXL() {
        this.seesDomContainText('.sc-ebmerl-4 > p', '10')
    }

}

export class RobotHands extends BaseHands {
    addToCart() {

        this.clickOnDomElement('.ekOVCH > .sc-124al1g-0')
    }
    clickOnCart() {
        this.clickOnDomElement('.sc-1h98xa9-2')
    }
    clickOnCrossButton() {
        this.clickOnDomElement('.sc-1h98xa9-0 > span')
    }
    clickOnSizeM() {
        this.clickOnDomElement(size_M)
        this.wait(2000)
    }
    clickOnSizeXS() {

        this.clickOnDomElement(size_XS)
        this.wait(2000)
    }
    clickOnSizeXL() {

        this.clickOnDomElement(size_XL)
    }
    increaseQuantity() {
        this.clickOnDomElement('.sc-11uohgb-4 > div > :nth-child(2)')
    }
    clicOnkCheckOut() {
        var textOfTotalPrize;
        //var alert='Checkout - Subtotal:'+textOfTotalPrize

        cy.get('.sc-1h98xa9-9').then(function (totalPrice) {
            var textOfTotalPrize = totalPrice.text()
            cy.log(textOfTotalPrize)


            cy.get('button').contains('Checkout').click()
            cy.on('window:alert', function (alertText) {
                expect(alertText).eq('Checkout - Subtotal: ' + textOfTotalPrize)
            })
        })
    }

    imageVisibility() {

        cy.get("div[alt='Skater Black Sweatshirt']").should('be.visible')
    }




}
