package screens

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import compose.LabelTextField
import model.Contact

@Composable
@Preview
fun Customer(){
    val map= listOf<Contact>(
        Contact("Fahad","03233344445"),
        Contact("Bilal","03423123333")
    )
    var contactInfo by remember {
        mutableStateOf(Contact("",""))
    }
    Column (modifier = Modifier.fillMaxSize().padding(start = 10.dp, top = 20.dp)){
        Row{
            LabelTextField("Customer Name: ",contactInfo.contactName,KeyboardType.Text){

            }
            Spacer(Modifier.width(20.dp))
            LabelTextField("Contact No: ",contactInfo.contactNo, KeyboardType.Number){

            }
        }
        Spacer(Modifier.height(50.dp))
        LazyColumn {
            item{
                Row (modifier = Modifier.fillMaxWidth(1f).background(Color.LightGray).padding(bottom = 20.dp)){
                    Text("Contact Name",Modifier.fillMaxWidth(0.5f))
                    Text("Contact Number",Modifier.fillMaxWidth(0.5f))
                    Text("Actions",Modifier.align(Alignment.CenterVertically))

                }
            }
            items(map){contact->
                Row (modifier = Modifier.fillMaxWidth(1f)){
                    Text(contact.contactName,Modifier.fillMaxWidth(0.5f))
                    Text(contact.contactNo,Modifier.fillMaxWidth(0.5f))
                    Icon(Icons.Filled.Edit,"Edit", modifier = Modifier.clickable {
                        contactInfo=contact
                    })
                }

            }
        }
    }
}